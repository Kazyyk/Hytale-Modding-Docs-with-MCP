---
title: "UIEventBuilder"
kind: "class"
package: "com.hypixel.hytale.server.core.ui.builder"
fqcn: "com.hypixel.hytale.server.core.ui.builder.UIEventBuilder"
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
public class UIEventBuilder
```

Fluent builder for constructing `CustomUIEventBinding` arrays sent to the client. Each binding associates a UI event type with a CSS-like selector and optional [EventData](EventData.md). The `locksInterface` parameter controls whether the event locks UI interaction while processing (defaults to true).

## Fields

| Field | Type | Description |
|---|---|---|
| `LOGGER` | `HytaleLogger` | Logger instance. |
| `EMPTY_EVENT_BINDING_ARRAY` | `CustomUIEventBinding[]` | Empty array constant. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `addEventBinding(CustomUIEventBindingType type, String selector)` | `UIEventBuilder` | Adds an event binding with no data (locks interface). |
| `addEventBinding(CustomUIEventBindingType type, String selector, boolean locksInterface)` | `UIEventBuilder` | Adds an event binding with no data and explicit lock control. |
| `addEventBinding(CustomUIEventBindingType type, String selector, EventData data)` | `UIEventBuilder` | Adds an event binding with data (locks interface). |
| `addEventBinding(CustomUIEventBindingType type, String selector, @Nullable EventData data, boolean locksInterface)` | `UIEventBuilder` | Adds an event binding with full configuration. |
| `getEvents()` | `CustomUIEventBinding[]` | Returns the built event binding array. |
