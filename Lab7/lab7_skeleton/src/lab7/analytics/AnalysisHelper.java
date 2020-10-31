/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import java.util.stream.Collectors;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import lab7.entities.User;

public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    
    // 1  Average number of Likes per comment
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("average of likes per comments: " + likeNumber / commentNumber);
            
    }
    
    //2 post with most liked comments
    public void postWithMostLikedComments(){
        Map<Integer, Integer> postLikesCount = new HashMap<>();
        Map<Integer, Post>posts=DataStore.getInstance().getPosts();
        for(Post post: posts.values()){
            
            for(Comment comment : post.getComments()){
                int likes =0;
                if(postLikesCount.containsKey(post.getPostId())){
                    likes = postLikesCount.get(post.getPostId());
                }
                likes += comment.getLikes();
                postLikesCount.put(post.getPostId(), likes);
            }
            
        }
        int max = 0;
        int maxid = 0;
        for(int id : postLikesCount.keySet()){
            if(postLikesCount.get(id) > max){
                max = postLikesCount.get(id);
                maxid = id;
            }
        }
        System.out.println("\n"+"post with most liked comments" +"\n"+"postid : "+ maxid + " with likes : " + max);
    }
    
    //3 post with most comments
    
    public void postWithMostComments(){
        
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int maxCommentSize = 0;
        int postid = 0;
        for(Post post: posts.values()){
            
            if(post.getComments().size() > maxCommentSize){
                maxCommentSize = post.getComments().size();
                postid = post.getPostId();
            }
        }
        
        System.out.println("\n"+"post with most comments" +"\n"+"postid : "+ postid + " with comment size : " + maxCommentSize);
        
    }
    
    
    //4   Top 5 inactive users based on total posts number
    public void inactiveUsersBasedOnPosts(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Integer> users = new HashMap<>();
        
        Map<Integer, Integer> sort = new HashMap<>();
        
       
        
        for(Post post: posts.values()){
            if(!(users.containsKey(post.getUserId()))){
                users.put(post.getUserId(),1);
            }
            else{
                users.put(post.getUserId(),users.get(post.getUserId())+1);
            }
            
        }
        
     
      
        
          Set<Map.Entry<Integer, Integer>> entrySet = users.entrySet();
          Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                Integer value1 = entry1.getValue();
                Integer value2 = entry2.getValue();
                return value1.compareTo(value2);
            }
        };

        List<Map.Entry<Integer, Integer>> listOfEntries = new ArrayList<>(entrySet);
        Collections.sort(listOfEntries, comparator);

        System.out.println("Top 5 Inactive Users on the basis of posts:");
        if (users.size() > 5) {
            int j = 0;
            for (int i = 0; i < 5; i++) {
                j = i + 1;
                System.out.println("Inactive User: " + j + " user id " + listOfEntries.get(i).getKey()
                        + " with number of posts: " + listOfEntries.get(i).getValue());
            }
        }
        System.out.println();
        
    }
    
    //5  Top 5 inactive users based on total comments they created
    
    public void inactiveUsersBasedOnComments(){
        Map<Integer, User> user = DataStore.getInstance().getUsers();
        Map<Integer, Integer> commentSize = new HashMap<>();
        
        for(User users: user.values()){
            commentSize.put(users.getId(),users.getComments().size());
        }
        
        Set<Map.Entry<Integer, Integer>> entrySet = commentSize.entrySet();
          Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                Integer value1 = entry1.getValue();
                Integer value2 = entry2.getValue();
                return value1.compareTo(value2);
            }
        };

        List<Map.Entry<Integer, Integer>> listOfEntries = new ArrayList<>(entrySet);
        Collections.sort(listOfEntries, comparator);

        System.out.println("Top 5 Inactive Users on the basis of comments:");
        if (commentSize.size() > 5) {
            int j = 0;
            for (int i = 0; i < 5; i++) {
                j = i + 1;
                System.out.println("Inactive User: " + j + " user id " + listOfEntries.get(i).getKey()
                        + " with number of comments: " + listOfEntries.get(i).getValue());
            }
        }
        System.out.println();
        
      }
    
    //6  Top 5 inactive users overall
    
    public void inactiveOverall(){
        Map<Integer, User> user = DataStore.getInstance().getUsers();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer, Integer> inactiveOverall = new HashMap<>();
        
        for(User users: user.values()){
            inactiveOverall.put(users.getId(), users.getComments().size());
        }
        
        for(Post post: posts.values()){
            inactiveOverall.put(post.getUserId(), inactiveOverall.get(post.getUserId())+1);
        }
        
        for(Comment comment : comments.values()){
            inactiveOverall.put(comment.getUserId(), inactiveOverall.get(comment.getUserId()) + comment.getLikes());
        }
        
        
        Set<Map.Entry<Integer, Integer>> entrySet = inactiveOverall.entrySet();
          Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                Integer value1 = entry1.getValue();
                Integer value2 = entry2.getValue();
                return value1.compareTo(value2);
            }
        };

        List<Map.Entry<Integer, Integer>> listOfEntries = new ArrayList<>(entrySet);
        Collections.sort(listOfEntries, comparator);

        System.out.println("Top 5 Inactive Users based on overall criteria:");
        if (inactiveOverall.size() > 5) {
            int j = 0;
            for (int i = 0; i < 5; i++) {
                j = i + 1;
                System.out.println("Inactive User: " + j + " user id " + listOfEntries.get(i).getKey()
                        + " with sum of posts, comments and likes: " + listOfEntries.get(i).getValue());
            }
        }
        System.out.println();
        
    }
    
    
    public void proactiveOverall(){
           Map<Integer, User> user = DataStore.getInstance().getUsers();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer, Integer> proactiveOverall = new HashMap<>();
        
        for(User users: user.values()){
            proactiveOverall.put(users.getId(), users.getComments().size());
        }
        
        for(Post post: posts.values()){
            proactiveOverall.put(post.getUserId(), proactiveOverall.get(post.getUserId())+1);
        }
        
        for(Comment comment : comments.values()){
            proactiveOverall.put(comment.getUserId(), proactiveOverall.get(comment.getUserId()) + comment.getLikes());
        }
        
        
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(proactiveOverall.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println("\n:\nTop 5 proactive users by overall criterias:");
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
            if (count >= 5) {
                return;
            }
            System.out.println("User Id = " + entry.getKey() + " Sum of post, likes and comments = " + entry.getValue());
            count++;
        }
    }
    
}
