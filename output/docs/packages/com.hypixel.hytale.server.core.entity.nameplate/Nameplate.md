---
title: "Nameplate"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.nameplate"
fqcn: "com.hypixel.hytale.server.core.entity.nameplate.Nameplate"
api_surface: false
extends: ~
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "nameplate"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.nameplate`

```java
public class Nameplate implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<Nameplate>` | `CODEC` |
| `@Nonnull private` | `String` | `text` |
| `private` | `boolean` | `isNetworkOutdated` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Nameplate()` |
| `public` | `Nameplate(@Nonnull String text)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ComponentType<EntityStore, Nameplate>` | `getComponentType()` |
| `@Nonnull public` | `String` | `getText()` |
| `public` | `void` | `setText(@Nonnull String text)` |
| `public` | `boolean` | `consumeNetworkOutdated()` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
