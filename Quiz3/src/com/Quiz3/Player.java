package com.Quiz3;

import java.util.Objects;

// This is the player class
public class Player
{
    private final String name;
    private final int id;

    public Player(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString()
    {
        return "Player{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
