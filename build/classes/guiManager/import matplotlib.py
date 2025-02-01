import matplotlib.pyplot as plt
import networkx as nx

# Create a directed graph
G = nx.DiGraph()

# Define nodes and edges with durations (Activity: (Start, End, Duration))
edges = [
    ("1", "2", "A: 3w"),  # Activity A
    ("2", "3", "B: 5w"),  # Activity B
    ("2", "4", "C: 6w"),  # Activity C
    ("3", "5", "D: 4w"),  # Activity D
    ("4", "6", "E: 2w"),  # Activity E
    ("4", "7", "F: 7w"),  # Activity F
    ("6", "8", "G: 6w"),  # Activity G (from E)
    ("7", "8", "G: 6w"),  # Activity G (from F)
    ("8", "9", "H: 4w"),  # Activity H
    ("8", "10", "I: 4w"), # Activity I
    ("9", "11", "J: 5w"), # Activity J (from H)
    ("10", "11", "J: 5w"),# Activity J (from I)
]

# Add nodes and edges to the graph
for edge in edges:
    G.add_edge(edge[0], edge[1], label=edge[2])

# Position nodes using a layered layout
pos = nx.nx_agraph.graphviz_layout(G, prog="dot")

# Draw the graph
plt.figure(figsize=(12, 8))
nx.draw(G, pos, with_labels=True, node_color="lightblue", node_size=2000, font_size=10, font_weight="bold", arrowsize=20)
edge_labels = nx.get_edge_attributes(G, 'label')
nx.draw_networkx_edge_labels(G, pos, edge_labels=edge_labels, font_size=10)

# Display the diagram
plt.title("Activity on Arrow (AOA) Diagram")
plt.show()
