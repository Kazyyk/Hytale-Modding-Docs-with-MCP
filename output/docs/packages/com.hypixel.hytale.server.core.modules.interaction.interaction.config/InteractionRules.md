---
title: "InteractionRules"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.InteractionRules"
api_surface: true
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.InteractionRules>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

```java
public class InteractionRules implements NetworkSerializable<com.hypixel.hytale.protocol.InteractionRules>
```

Defines blocking, interruption, and bypass rules that control when interactions can start or must stop.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<InteractionRules>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `validateInterrupts(@Nonnull InteractionType type, @Nonnull Int2ObjectMap<IntSet> selfTags, @Nonnull InteractionType otherType, @Nonnull Int2ObjectMap<IntSet> otherTags, @Nonnull InteractionRules otherRules)` |
| `public` | `boolean` | `validateBlocked(@Nonnull InteractionType type, @Nonnull Int2ObjectMap<IntSet> selfTags, @Nonnull InteractionType otherType, @Nonnull Int2ObjectMap<IntSet> otherTags, @Nonnull InteractionRules otherRules)` |
| `public` | `com.hypixel.hytale.protocol.InteractionRules` | `toPacket()` |
| `public` | `String` | `toString()` |
