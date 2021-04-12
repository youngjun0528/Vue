
graph = {1: [2, 3, 4],
         2: [1, 3, 4, 5, 6],
         3: [1, 2, 7],
         4: [1, 2, 5, 6],
         5: [2, 4, 6, 7],
         6: [2, 4, 5, 7],
         7: [3, 5, 6]}

start = 1
end = 7
queue = [start]
visited = []


def sol(n, visited):
    if n[-1] == end:
        return len(visited)

    if n[-1] in visited:
        return len(visited)

    visited.append(n[-1])
    length = 0

    for next_node in graph[n[-1]]:
        n.append(next_node)
        length = max(length, sol(n, visited))
        queue.pop(-1)
    return length


print(sol(queue, visited))


def find_all_paths(graph, start, end, path=[]):
    path = path + [start]
    if start == end:
        return [path]
    if start not in graph:
        return []
    paths = []
    for node in graph[start]:
        if node not in path:
            newpaths = find_all_paths(graph, node, end, path)
            for newpath in newpaths:
                paths.append(newpath)
    return paths


def find_shortest_path(graph, start, end, path=[]):
    path = path + [start]
    if start == end:
        return path
    if start not in graph:
        return None
    shortest = None
    for node in graph[start]:
        if node not in path:
            newpath = find_shortest_path(graph, node, end, path)
            if newpath:
                if not shortest or len(newpath) < len(shortest):
                    shortest = newpath
    return shortest


def find_maxest_path(graph, start, end, path=[]):
    path = path + [start]
    if start == end:
        return path
    if start not in graph:
        return None
    shortest = None
    for node in graph[start]:
        if node not in path:
            newpath = find_maxest_path(graph, node, end, path)
            if newpath:
                if not shortest or len(newpath) > len(shortest):
                    shortest = newpath
    return shortest


print(find_maxest_path(graph, 1, 7))
