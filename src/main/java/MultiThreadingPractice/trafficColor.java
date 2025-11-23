/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiThreadingPractice;

/**
 *
 * @author humai
 */
public enum trafficColor {
    RED(9000), YELLOW(1000), GREEN(15000);
    
    private final int ontimeInMillis;

    public int getOntimeInMillis() {
        return ontimeInMillis;
    }

    private trafficColor(int ontimeInMillis) {
        this.ontimeInMillis = ontimeInMillis;
    }
    
}
