---
title: "com.hypixel.hytale.component.dependency"
package: "com.hypixel.hytale.component.dependency"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
---

**Package:** `com.hypixel.hytale.component.dependency`

## Enums

| Type | Description |
|---|---|
| [Order](Order.md) | Ordering relationship between dependent systems |

## Classes

| Type | Description |
|---|---|
| [Dependency](Dependency.md) | Abstract base for ECS system dependency relationships |
| [DependencyGraph](DependencyGraph.md) | Dependency graph for resolving ECS system execution order |
| [OrderPriority](OrderPriority.md) | Priority for fine-grained dependency ordering |
| [RootDependency](RootDependency.md) | Root dependency with no predecessors |
| [SystemDependency](SystemDependency.md) | Dependency on a specific system |
| [SystemGroupDependency](SystemGroupDependency.md) | Dependency on a group of systems |
| [SystemTypeDependency](SystemTypeDependency.md) | Dependency on all systems of a given type |
