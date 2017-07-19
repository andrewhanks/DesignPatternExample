package com.example.andrewhanks.myapplication.creational.builder;

public class BuilderMain {
    public static void start() {
        final int[][] material = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 2, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 0, 2, 1, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1},
                {1, 0, 0, 2, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}};

        MazeDirector director = new MazeDirector(material,
                new PlainBuilder(material.length, material[0].length));
        director.build().paint();
    }

    static class PlainBuilder implements MazeBuilder {
        private char[][] maze;

        PlainBuilder(int i, int j) {
            this.maze = new char[i][j];
        }

        public void buildRoad(int i, int j) {
            maze[i][j] = '　';
        }

        public void buildWall(int i, int j) {
            maze[i][j] = '□';
        }

        public void buildTreasure(int i, int j) {
            maze[i][j] = '★';
        }

        @Override
        public Maze getMaze() {
            return new Maze() {
                @Override
                public void paint() {
                    for (char[] row : maze) {
                        for (char ele : row) {
                            System.out.print(ele);
                        }
                        System.out.println();
                    }
                }
            };
        }
    }
}
