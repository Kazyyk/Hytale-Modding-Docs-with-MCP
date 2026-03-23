---
title: "DeployableProjectileComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.deployables.component"
fqcn: "com.hypixel.hytale.builtin.deployables.component.DeployableProjectileComponent"
api_surface: false
extends: ~
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "deployables"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.deployables.component`

```java
public class DeployableProjectileComponent implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull protected` | `Vector3d` | `previousTickPosition` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `DeployableProjectileComponent()` |
| `public` | `DeployableProjectileComponent(@Nonnull Vector3d previousTickPosition)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, DeployableProjectileComponent>` | `getComponentType()` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
| `@Nonnull public` | `Vector3d` | `getPreviousTickPosition()` |
| `public` | `void` | `setPreviousTickPosition(@Nonnull Vector3d pos)` |
