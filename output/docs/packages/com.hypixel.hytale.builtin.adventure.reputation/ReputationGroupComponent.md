---
title: "ReputationGroupComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.reputation"
fqcn: "com.hypixel.hytale.builtin.adventure.reputation.ReputationGroupComponent"
api_surface: false
extends: null
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "reputation"
---

**Package:** `com.hypixel.hytale.builtin.adventure.reputation`

```java
public class ReputationGroupComponent implements Component<EntityStore>
```

An `EntityStore` component storing ReputationGroupComponent-related data on entities.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `String` | `reputationGroupId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ReputationGroupComponent(@Nonnull String reputationGroupId)` |
| `@Nonnull public static` | `ComponentType<EntityStore, ReputationGroupComponent>` | `getComponentType()` |
| `@Nonnull public` | `String` | `getReputationGroupId()` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
