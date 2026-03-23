---
title: "ListPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.ListPositionProvider"
api_surface: false
extends: "PositionProvider"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "positionproviders"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.positionproviders`

```java
public class ListPositionProvider extends PositionProvider
```

Provider supplying ListPosition values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `List<Vector3i>` | `positions3i` |
| `private` | `List<Vector3d>` | `positions3d` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | | `ListPositionProvider()` |
| `@Nonnull public static` | `ListPositionProvider` | `from3i(@Nonnull List<Vector3i> positions3i)` |
| `@Nonnull public static` | `ListPositionProvider` | `from3d(@Nonnull List<Vector3d> positions3d)` |
| `@Override public` | `void` | `positionsIn(@Nonnull PositionProvider.Context context)` |
