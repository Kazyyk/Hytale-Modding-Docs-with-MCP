---
title: "MemoriesPage.PageEventData"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.page"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.page.MemoriesPage.PageEventData"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "memories"
  - "codec"
  - "ui"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories.page`

```java
public static class PageEventData
```

Codec-backed event data for the memories page UI. Carries the action type, an optional category name, and an optional memory ID.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `KEY_ACTION` |
| `public static final` | `String` | `KEY_CATEGORY` |
| `public static final` | `String` | `KEY_MEMORY_ID` |
| `public static final` | `BuilderCodec<MemoriesPage.PageEventData>` | `CODEC` |
| `public` | `MemoriesPage.PageAction` | `action` |
| `public` | `String` | `category` |
| `public` | `String` | `memoryId` |
