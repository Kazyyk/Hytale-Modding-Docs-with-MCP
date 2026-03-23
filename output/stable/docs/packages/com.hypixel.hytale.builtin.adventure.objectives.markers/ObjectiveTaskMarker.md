---
title: "ObjectiveTaskMarker"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.markers"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.markers.ObjectiveTaskMarker"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "markers"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.markers`

```java
public class ObjectiveTaskMarker
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ObjectiveTaskMarker>` | `CODEC` |
| `public static final` | `ArrayCodec<ObjectiveTaskMarker>` | `ARRAY_CODEC` |
| `private` | `String` | `id` |
| `private` | `Transform` | `transform` |
| `private` | `String` | `icon` |
| `private` | `Message` | `name` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getId()` |
| `public` | `Transform` | `getTransform()` |
| `public` | `String` | `getIcon()` |
| `public` | `Message` | `getName()` |
| `public` | `MapMarker` | `toProto()` |
