---
title: "ISystem"
kind: "interface"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.ISystem"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "interface"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public interface ISystem<ECS_TYPE>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `ISystem[]` | `EMPTY_ARRAY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `default` | `void` | `onSystemRegistered()` |
| `default` | `void` | `onSystemUnregistered()` |
| `@Nullable default` | `SystemGroup<ECS_TYPE>` | `getGroup()` |
| `@Nonnull default` | `Set<Dependency<ECS_TYPE>>` | `getDependencies()` |
| `static` | `<ECS_TYPE> void` | `calculateOrder(@Nonnull ComponentRegistry<ECS_TYPE> registry, @Nonnull ISystem<ECS_TYPE>[] sortedSystems, int systemSize)` |
