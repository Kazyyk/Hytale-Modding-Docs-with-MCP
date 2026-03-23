# SystemGroupDependency

Type: class | Package: com.hypixel.hytale.component.dependency | Extends: Dependency

public class SystemGroupDependency extends Dependency

Dependency specifying that a system depends on an entire group of systems.

Also in this package: Dependency, DependencyGraph, Edge, Order, OrderPriority, RootDependency, SystemDependency, SystemTypeDependency

Complete API:
  public SystemGroup<ECS_TYPE> getGroup()
  public void validate(ComponentRegistry<ECS_TYPE> registry)
  public void resolveGraphEdge(ComponentRegistry<ECS_TYPE> registry, ISystem<ECS_TYPE> thisSystem, DependencyGraph<ECS_TYPE> graph)
  public String toString()

Fields:
private final SystemGroup<ECS_TYPE> group
