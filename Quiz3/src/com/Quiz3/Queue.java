package com.Quiz3;

import java.util.NoSuchElementException;

// This is the queue class
public class Queue
{
    private Player[] queue;
    private int front;
    private int back;
    public  Queue (int capacity) {
        queue = new Player[capacity];
    }

    public void add(Player player)
    {

        // This adds a player at the back of the queue
        if (back == queue.length)
        {
            Player[] newArray = new Player[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = player;
        back++;
    }

    // This removes the player that is in front of the queue
    public Player remove()
    {
        if (size() == 0)
        {
            throw new NoSuchElementException();
        }

        Player removePlayer = queue[front];
        queue[front] = null;
        front++;
        return removePlayer;
    }

    // This gets the number of players in the queue
    public int size() {
        return back - front;
    }

    // This outputs all the players of the queue
    public void printQue()
    {
        for (int i = front; i < back; i++)
        {
            System.out.println(queue[i]);
        }
    }
}