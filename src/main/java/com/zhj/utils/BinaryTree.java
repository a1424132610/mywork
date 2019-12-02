package com.zhj.utils;


import lombok.Data;

import javax.swing.tree.TreeNode;
import java.util.Objects;

/**
 * 　　　　　　　   ┏┓　   ┏┓+ +
 * 　　　　　　　┏┛┻━━━┛┻┓ + +
 * 　　　　　　　┃　　　　　　　┃
 * 　　　　　　　┃　　　━　　　┃ ++ + + +
 * 　　　　　　 ████━████ ┃+
 * 　　　　　　　┃　　　　　　　┃ +
 * 　　　　　　　┃　　　┻　　　┃
 * 　　　　　　　┃　　　　　　　┃ + +
 * 　　　　　　　┗━┓　　　┏━┛
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃ + + + +
 * 　　　　　　　　　┃　　　┃			God beast body, code no BUG
 * 　　　　　　　　　┃　　　┃ +			神兽护体,代码无BUG
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃　　+
 * 　　　　　　　　　┃　 　　┗━━━┓ + +
 * 　　　　　　　　　┃ 　　　　　　　┣┓
 * 　　　　　　　　　┃ 　　　　　　　┏┛
 * 　　　　　　　　　┗┓┓┏━┳┓┏┛ + + + +
 * 　　　　　　　　　　┃┫┫　┃┫┫
 * 　　　　　　　　　　┗┻┛　┗┻┛+ + + +
 *
 * @author 14241
 * @title:
 * @date 2019/10/16
 */
@Data
public class BinaryTree {

    private TreeNode root = null;

    public BinaryTree() {
        //创建根节点
        root = new TreeNode(1, "A");
    }


    /**
     * 创建二叉树
     * A
     * B   C
     * D   E   F
     */
    public void createBinaryTree() {
        TreeNode nodeB = new TreeNode(2, "B");
        TreeNode nodeC = new TreeNode(3, "C");
        TreeNode nodeD = new TreeNode(4, "D");
        TreeNode nodeE = new TreeNode(5, "E");
        TreeNode nodeF = new TreeNode(6, "F");
        root.leftChild = nodeB;
        root.rightChild = nodeC;
        nodeB.leftChild = nodeD;
        nodeB.rightChild = nodeE;
        nodeC.rightChild = nodeF;
    }

    /**
     * 求二叉树的高度
     */
    public int getHeight() {
        return getHeight(root);
    }

    /**
     * A
     * B   C
     * D   E   F
     */
    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int i = getHeight(root.leftChild);
            int j = getHeight(root.rightChild);
            return (i < j) ? j + 1 : i + 1;
        }
    }

    /**
     * 获取节点数
     * A
     * B   C
     * D   E   F
     */
    public int getSize() {
        return getSize(root);
    }

    private int getSize(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + getSize(node.leftChild) + getSize(node.rightChild);
        }
    }

    /**
     * 前序遍历打印一遍
     */
    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        } else {
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }
    /**
     * 中序遍历打印一遍
     */
    public void midOrder(TreeNode node) {
        if (node == null) {
            return;
        } else {
            midOrder(node.leftChild);
            midOrder(node.rightChild);
        }

    }

    /**
     * 获取节点数
     *      A
     *    B   C
     *  D   E   F
     */
    public TreeNode findNode(TreeNode node, String s) {
        if (Objects.isNull(node)) {
            return null;
        }
        if (node.data.equals(s)) {
            return node;
        }
        TreeNode left = findNode(node.leftChild, s);
        if (left != null) {
            return left;
        }
        TreeNode right = findNode(node.rightChild, s);
        if(right != null){
            return right;
        }else {
            return null;
        }
    }

    @Data
    public class TreeNode {
        private int index;
        private String data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        public TreeNode(int index, String data) {
            this.index = index;
            this.data = data;
        }
    }


}
