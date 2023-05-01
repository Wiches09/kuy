/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package olab_05;

/**
 *
 * @author helld
 */
public class Player {
    private String name;
    private String team;
    
    public void setName(String n){
        name = n;
    }
    public void setTeam(String t){
        team = t;
    }
    
    public String getName(){
        return name;
    }
    public String getTeam(){
        return team;
    }
    public boolean isSameTeam(Player p){
        return p.team.equals(team);
    }
}
