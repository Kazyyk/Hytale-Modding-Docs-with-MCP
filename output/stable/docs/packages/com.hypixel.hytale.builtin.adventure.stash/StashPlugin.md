---
title: "StashPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.stash"
fqcn: "com.hypixel.hytale.builtin.adventure.stash.StashPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "adventure"
  - "stash"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.stash`

```java
public class StashPlugin extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `HytaleLogger` | `LOGGER` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `StashPlugin(@Nonnull JavaPluginInit init)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `setup()` |
| `@Nullable public static` | `ListTransaction<ItemStackTransaction>` | `stash(@Nonnull ItemContainerState containerState, boolean clearDropList)` |

## Inner Types

- `StashPlugin.StashSystem`
