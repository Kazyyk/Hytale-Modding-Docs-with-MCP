# DependencyGraph

Type: class | Package: com.hypixel.hytale.component.dependency

public class DependencyGraph

Directed graph of system dependencies used to determine a valid execution order for ECS systems. Performs topological sorting to resolve the final system schedule.

Also in this package: Dependency, Edge, Order, OrderPriority, RootDependency, SystemDependency, SystemGroupDependency, SystemTypeDependency

Complete API:
  public ISystem<ECS_TYPE>[] getSystems()
  public void resolveEdges(ComponentRegistry<ECS_TYPE> registry)
  public void addEdgeFromRoot(ISystem<ECS_TYPE> afterSystem, int priority)
  public void addEdge(ISystem<ECS_TYPE> beforeSystem, ISystem<ECS_TYPE> afterSystem, int priority)
  public void addEdge(DependencyGraph.Edge<ECS_TYPE> edge)
  public void sort(ISystem<ECS_TYPE>[] sortedSystems)
  private boolean hasEdgeOfLaterPriority(ISystem<ECS_TYPE> system, int priority)
  private void resolveEdgesFor(ISystem<ECS_TYPE> system)
  private void fulfillEdgesFor(ISystem<ECS_TYPE> system)
  public String toString()

Fields:
private final ISystem<ECS_TYPE>[] systems
private final Map<ISystem<ECS_TYPE>,List<DependencyGraph.Edge<ECS_TYPE>>> beforeSystemEdges
private final Map<ISystem<ECS_TYPE>,List<DependencyGraph.Edge<ECS_TYPE>>> afterSystemEdges
private final Map<ISystem<ECS_TYPE>,Set<DependencyGraph.Edge<ECS_TYPE>>> afterSystemUnfulfilledEdges
private DependencyGraph.Edge<ECS_TYPE>[] edges
