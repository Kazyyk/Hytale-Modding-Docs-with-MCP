---
title: "DeployablesPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.deployables"
fqcn: "com.hypixel.hytale.builtin.deployables.DeployablesPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "deployables"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.deployables`

```java
public class DeployablesPlugin extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `DeployablesPlugin` | `instance` |
| `private` | `ComponentType<EntityStore, DeployableComponent>` | `deployableComponentType` |
| `private` | `ComponentType<EntityStore, DeployableOwnerComponent>` | `deployableOwnerComponentType` |
| `private` | `ComponentType<EntityStore, DeployableProjectileShooterComponent>` | `deployableProjectileShooterComponentType` |
| `private` | `ComponentType<EntityStore, DeployableProjectileComponent>` | `deployableProjectileComponentType` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `DeployablesPlugin(@Nonnull JavaPluginInit init)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `DeployablesPlugin` | `get()` |
| `@Override protected` | `void` | `setup()` |
| `public` | `ComponentType<EntityStore, DeployableComponent>` | `getDeployableComponentType()` |
| `public` | `ComponentType<EntityStore, DeployableOwnerComponent>` | `getDeployableOwnerComponentType()` |
| `public` | `ComponentType<EntityStore, DeployableProjectileShooterComponent>` | `getDeployableProjectileShooterComponentType()` |
| `public` | `ComponentType<EntityStore, DeployableProjectileComponent>` | `getDeployableProjectileComponentType()` |
