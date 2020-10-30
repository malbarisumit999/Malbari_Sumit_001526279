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

import java.util.HashMap;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;


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
    
    
}
