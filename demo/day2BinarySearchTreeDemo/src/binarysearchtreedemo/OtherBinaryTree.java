/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtreedemo;

/**
 *
 * @author kasper
 */
public class OtherBinaryTree {
    public static void main( String[] args ) {
        OtherBinaryTree bt = null;
        bt = new OtherBinaryTree( 7 );
        bt.insert( 5 );
        bt.insert( 9 );
        bt.insert( 13 );

        int res = bt.size();

    }

    OtherBinaryTree left;
    OtherBinaryTree right;
    Integer data = null;

    OtherBinaryTree( int data ) {
        this.data = data;
    }

    void insert( int newData ) {
        if ( newData < data ) {
            if ( left == null )
                left = new OtherBinaryTree( newData );
            else
                left.insert( newData );
        } else {
            if ( right == null )
                right = new OtherBinaryTree( newData );
            else
                right.insert( newData );
        }
    }

    boolean lookup( int data ) {
        if ( data == this.data )
            return true;
        if ( left != null && data < this.data )
            return left.lookup( data );
        if ( right != null && data > this.data )
            return right.lookup( data );
        return false;
    }

    int size() {
        return ( left != null ? left.size() : 0 ) 
                + 1 
                + ( right != null ? right.size() : 0 );
    }
}
