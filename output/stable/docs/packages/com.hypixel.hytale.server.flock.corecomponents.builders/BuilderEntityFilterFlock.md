---
title: "BuilderEntityFilterFlock"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.builders.BuilderEntityFilterFlock"
api_surface: false
extends: "BuilderEntityFilterBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "flock"
  - "corecomponents"
  - "builders"
---

**Package:** `com.hypixel.hytale.server.flock.corecomponents.builders`

```java
public class BuilderEntityFilterFlock extends BuilderEntityFilterBase
```

NPC behavior filter builder for EntityFilterFlock functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `FlockMembershipType` | `flockMembership` |
| `protected` | `FlockPlayerMembership` | `flockPlayerMembership` |
| `protected` | `int[]` | `size` |
| `protected` | `boolean` | `checkCanJoin` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `IEntityFilter` | `build(BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<IEntityFilter>` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `int[]` | `getSize()` |
| `public` | `FlockMembershipType` | `getFlockMembership()` |
| `public` | `FlockPlayerMembership` | `getFlockPlayerMembership()` |
| `public` | `boolean` | `isCheckCanJoin()` |
