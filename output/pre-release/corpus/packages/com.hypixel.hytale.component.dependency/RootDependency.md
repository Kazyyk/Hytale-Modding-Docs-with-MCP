# RootDependency

Type: class | Package: com.hypixel.hytale.component.dependency | Extends: Dependency

public class RootDependency extends Dependency

Dependency representing a root node in the dependency graph (no predecessors).

Also in this package: Dependency, DependencyGraph, Edge, Order, OrderPriority, SystemDependency, SystemGroupDependency, SystemTypeDependency

Complete API:
  public static RootDependency<ECS_TYPE> first()
  public static RootDependency<ECS_TYPE> last()
  public static Set<Dependency<ECS_TYPE>> firstSet()
  public static Set<Dependency<ECS_TYPE>> lastSet()
  public void validate(ComponentRegistry<ECS_TYPE> registry)
  public void resolveGraphEdge(ComponentRegistry<ECS_TYPE> registry, ISystem<ECS_TYPE> thisSystem, DependencyGraph<ECS_TYPE> graph)
  public String toString()

Fields:
private static final RootDependency<?> FIRST
private static final RootDependency<?> LAST
private static final Set<Dependency<?>> FIRST_SET
private static final Set<Dependency<?>> LAST_SET
