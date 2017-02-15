/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducnt3
 */
public class EvenTree {
        public static void main(String[] args) {
                Node[] nodes = new Node[101];
                int n = 10, m = 9;
                for(int i=1; i<= n; i++) {
                        nodes[i] = new Node();
                }
                
                nodes[1].addNode(nodes[2]);
                nodes[1].addNode(nodes[3]);
                nodes[3].addNode(nodes[4]);
                nodes[2].addNode(nodes[5]);
                nodes[1].addNode(nodes[6]);
                nodes[2].addNode(nodes[7]);
                nodes[6].addNode(nodes[8]);
                nodes[8].addNode(nodes[9]);
                nodes[8].addNode(nodes[10]);
        }
        
        private static int solve(Node node) {
                if(node.getSize() == 1) {
                        return 0;
                }
                int ret = 0;
                for(Node cNode : node.nodes) {
                        if(cNode.getSize() % 2 == 0) {
                                ret ++;
                        }
                }
                
                return ret;
        }
        
        static class Node {
                List<Node> nodes = new ArrayList<>();
                private int size = -1;
                
                public void addNode(Node node) {
                        size = -1;
                        nodes.add(node);
                }
                
                public int getSize() {
                        // cache size
                        if(size != -1) {
                                return size;
                        }
                        
                        if(nodes.size() == 0) {
                                return 1;
                        }
                        int result = 1;
                        for(Node node : nodes) {
                                result += node.getSize();
                        }
                        
                        size = result;
                        
                        return result;
                }
        }
}
