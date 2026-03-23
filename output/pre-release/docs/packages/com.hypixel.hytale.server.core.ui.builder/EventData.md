---
title: "EventData"
kind: "record"
package: "com.hypixel.hytale.server.core.ui.builder"
fqcn: "com.hypixel.hytale.server.core.ui.builder.EventData"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "ui"
---

**Package:** `com.hypixel.hytale.server.core.ui.builder`

```java
public record EventData(Map<String, String> events)
```

Record holding a string-to-string map of UI event data. Used by [UIEventBuilder](UIEventBuilder.md) to attach key-value metadata to event bindings. Supports fluent `append` and `put` for building the map.

## Record Components

| Component | Type | Description |
|---|---|---|
| `events` | `Map<String, String>` | The underlying event data map. |

## Constructors

| Constructor | Description |
|---|---|
| `EventData()` | Creates an empty event data map. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `append(String key, String value)` | `EventData` | Adds a key-value pair and returns this instance. |
| `append(String key, @Nonnull T enumValue)` | `EventData` | Adds an enum's name as the value. |
| `put(String key, String value)` | `EventData` | Puts a key-value pair into the map. |
| `of(@Nonnull String key, @Nonnull String value)` | `EventData` | Static. Creates an `EventData` with a single entry. |
