import kotlin.Pair;

import java.util.*;

public class socar {

    public static void main(String[] args) {
        int[] solution = solution(6, 17, new int[][]{
                {5, 4, 6}, {5, 2, 5}, {0, 4, 2}, {2, 3, 3}, {1, 2, 7}, {0, 1, 3}
        });
        System.out.println(Arrays.toString(solution));
        int[] solution1 = solution(4, 10, new int[][]{
                {0, 1, 2}, {0, 2, 3}
        });
        System.out.println(Arrays.toString(solution1));
        int[] solution2 = solution(4, 11, new int[][]{
                {0, 1, 2}, {1, 2, 7}, {2, 3, 10}, {3, 0, 9}
        });
        System.out.println(Arrays.toString(solution2));
    }

    static class Edge {
        int destination;
        int time;

        Edge(int destination, int time) {
            this.destination = destination;
            this.time = time;
        }
    }

    static int[] solution(int n, int k, int[][] roads) {

        // 그래프 초기화
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] road : roads) {
            int start = road[0];
            int end = road[1];
            int time = road[2];
            graph.get(start).add(new Edge(end, time));
            graph.get(end).add(new Edge(start, time));
        }

        // BFS 수행
        Queue<Edge> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        int[] times = new int[n];
        Arrays.fill(times, Integer.MAX_VALUE);
        queue.offer(new Edge(0, 0));
        visited[0] = true;
        times[0] = 0;

        while (!queue.isEmpty()) {
            Edge current = queue.poll();
            int currentNode = current.destination;
            int currentTime = current.time;

            for (Edge next : graph.get(currentNode)) {
                int nextNode = next.destination;
                int nextTime = next.time;
                int totalTime = currentTime + nextTime;

                if (totalTime <= k && totalTime < times[nextNode]) {
                    times[nextNode] = totalTime;
                    queue.offer(new Edge(nextNode, totalTime));
                }
            }
        }

        // 결과 배열 생성
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (times[i] <= k) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] sortedResult = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                sortedResult[i] = result.get(i);
            }
            Arrays.sort(sortedResult);
            return sortedResult;
        }
    }

    public class Solution {
        public int solution(int[] numbers, int k) {
            int[] sortedNumbers = numbers.clone();
            Arrays.sort(sortedNumbers);

            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] != sortedNumbers[i]) {
                    count++;
                }
            }

            if (count <= k) {
                return 0;
            } else {
                return Math.abs(k - count);
            }
        }
    }


}

