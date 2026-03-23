---
title: "ModifyEvent.ContentLoader"
kind: "interface"
package: "com.hypixel.hytale.builtin.worldgen.modifier.event"
fqcn: "com.hypixel.hytale.builtin.worldgen.modifier.event.ModifyEvent.ContentLoader"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "modifier"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.worldgen.modifier.event`

```java
public interface ContentLoader<T>
```

Functional interface for loading content from a JSON element.

## Methods

```java
@Nonnull
    EventType type()
```

```java
@Nonnull
    List<T> entries()
```
