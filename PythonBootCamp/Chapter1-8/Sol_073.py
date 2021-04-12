# Short Path

from collections import deque
import heapq  # 우선순위 큐 구현을 위함

# 탐색할 그래프와 시작 정점을 인수로 전달받습니다.


def dijkstra(graph, start, end):
    # 시작 정점에서 각 정점까지의 거리를 저장할 딕셔너리를 생성하고, 무한대(inf)로 초기화합니다.
    distances = {vertex: [float('inf'), start] for vertex in graph}

    # 그래프의 시작 정점의 거리는 0으로 초기화 해줌
    distances[start] = [0, start]

    # 모든 정점이 저장될 큐를 생성합니다.
    queue = []

    # 그래프의 시작 정점과 시작 정점의 거리(0)을 최소힙에 넣어줌
    heapq.heappush(queue, [distances[start][0], start])

    while queue:

        # 큐에서 정점을 하나씩 꺼내 인접한 정점들의 가중치를 모두 확인하여 업데이트합니다.
        current_distance, current_vertex = heapq.heappop(queue)

        # 더 짧은 경로가 있다면 무시한다.
        if distances[current_vertex][0] < current_distance:
            continue

        for adjacent, weight in graph[current_vertex].items():
            distance = current_distance + weight
            # 만약 시작 정점에서 인접 정점으로 바로 가는 것보다 현재 정점을 통해 가는 것이 더 가까울 경우에는
            if distance < distances[adjacent][0]:
                # 거리를 업데이트합니다.
                distances[adjacent] = [distance, current_vertex]
                heapq.heappush(queue, [distance, adjacent])

    path = end
    path_output = [end]
    while distances[path][1] != start:
        path_output.append(distances[path][1])
        path = distances[path][1]
    path_output.append(start)
    print(path_output)
    return distances


# 방향 그래프
# mygraph = {
#     'A': {'B': 8, 'C': 1, 'D': 2},
#     'B': {},
#     'C': {'B': 5, 'D': 2},
#     'D': {'E': 3, 'F': 5},
#     'E': {'F': 1},
#     'F': {'A': 5}
# }

graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E']),
         }
mygraph = {}
for key in graph:
    item = graph.get(key)
    temp = {}
    for i in item:
        temp[i] = 1
    mygraph[key] = temp

print(mygraph)
print(dijkstra(mygraph, 'A', 'F'))

# print(dijkstra(graph, 'A', 'F'))


# graph = {'A': set(['B', 'C']),
#          'B': set(['A', 'D', 'E']),
#          'C': set(['A', 'F']),
#          'D': set(['B']),
#          'E': set(['B', 'F']),
#          'F': set(['C', 'E'])}

# start, end = [i for i in input().split()]

# queue = [start]
# visited = [start]


# def solution():
#     count = -1

#     while len(queue) != 0:
#         count += 1
#         size = len(queue)

#         for i in range(size):
#             node = queue.pop(0)
#             if node == end:
#                 return count

#             for next_node in graph[node]:
#                 if next_node not in visited:
#                     visited.append(next_node)
#                     queue.append(next_node)


graph = {'A': ['B', 'C'],
         'B': ['A', 'D', 'E'],
         'C': ['A', 'F'],
         'D': ['B'],
         'E': ['B', 'F'],
         'F': ['C', 'E']}


def find_shortest_path(graph, start, end):
    dist = {start: [start]}
    q = deque(start)
    while len(q):
        at = q.popleft()
        for next in graph[at]:
            if next not in dist:
                dist[next] = dist[at] + [next]
                q.append(next)
    return dist.get(end)


print(find_shortest_path(graph, 'A', 'F'))
