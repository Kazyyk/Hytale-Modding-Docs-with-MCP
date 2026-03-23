# SystemTypeDependency

Type: class | Package: com.hypixel.hytale.component.dependency | Extends: Dependency

public class SystemTypeDependency extends Dependency

Dependency specifying that a system depends on all systems of a given type.

Also in this package: Dependency, DependencyGraph, Edge, Order, OrderPriority, RootDependency, SystemDependency, SystemGroupDependency

Complete API:
  public SystemType<ECS_TYPE,T> getSystemType()
  public void validate(ComponentRegistry<ECS_TYPE> registry)
  public void resolveGraphEdge(ComponentRegistry<ECS_TYPE> registry, ISystem<ECS_TYPE> thisSystem, DependencyGraph<ECS_TYPE> graph)
  public String toString()

Fields:
private final SystemType<ECS_TYPE,T> systemType
