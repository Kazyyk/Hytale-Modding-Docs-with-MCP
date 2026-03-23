# Dependency

Type: class | Package: com.hypixel.hytale.component.dependency

public abstract class Dependency

Abstract base class representing a dependency relationship between ECS systems, used for ordering system execution.

Known subclasses: RootDependency, SystemDependency, SystemGroupDependency, SystemTypeDependency

Also in this package: DependencyGraph, Edge, Order, OrderPriority, RootDependency, SystemDependency, SystemGroupDependency, SystemTypeDependency

Complete API:
  public Order getOrder()
  public int getPriority()
  public abstract void validate(ComponentRegistry<ECS_TYPE> var1)
  public abstract void resolveGraphEdge(ComponentRegistry<ECS_TYPE> var1, ISystem<ECS_TYPE> var2, DependencyGraph<ECS_TYPE> var3)
  public String toString()

Fields:
protected final Order order
protected final int priority
