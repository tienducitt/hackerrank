/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingTheCodingInterview;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ducnt3 script: https://www.hackerrank.com/challenges/ctci-is-binary-search-tree?h_r=next-challenge&h_v=zen
 */
public class P2_BinarySearchTree {

        public static Queue queue = new LinkedList();

        boolean checkBST(Node root) {
                queue.add(new NodeP(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

                while (!queue.isEmpty()) {
                        NodeP node = (NodeP) queue.poll();
                        if (node.node.data <= node.min || node.node.data >= node.max) {
                                return false;
                        }
                        if (node.node.left != null) {
                                queue.add(new NodeP(node.node.left, node.min, node.node.data));
                        }

                        if (node.node.right != null) {
                                queue.add(new NodeP(node.node.right, node.node.data, node.max));
                        }
                }

                return true;
        }

        static class NodeP {
                Node node;
                int min;
                int max;

                public NodeP(Node node, int min, int max) {
                        this.node = node;
                        this.min = min;
                        this.max = max;
                }
        }
        
        static class Node {
                int data;
                Node left;
                Node right;
        }
}
