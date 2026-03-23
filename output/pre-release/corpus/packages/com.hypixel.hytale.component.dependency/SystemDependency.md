# SystemDependency

Type: class | Package: com.hypixel.hytale.component.dependency | Extends: Dependency

public class SystemDependency extends Dependency

Dependency specifying that one system depends on a specific other system.

Also in this package: Dependency, DependencyGraph, Edge, Order, OrderPriority, RootDependency, SystemGroupDependency, SystemTypeDependency

Complete API:
  public Class<T> getSystemClass()
  public void validate(ComponentRegistry<ECS_TYPE> registry)
  public void resolveGraphEdge(ComponentRegistry<ECS_TYPE> registry, ISystem<ECS_TYPE> thisSystem, DependencyGraph<ECS_TYPE> graph)
  public String toString()

Fields:
private final Class<T> systemClass
