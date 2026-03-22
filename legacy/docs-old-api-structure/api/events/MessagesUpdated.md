---
title: "MessagesUpdated"
kind: "event"
package: "com.hypixel.hytale.server.core.modules.i18n.event"
fqcn: "com.hypixel.hytale.server.core.modules.i18n.event.MessagesUpdated"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - i18n
---

> Package: `com.hypixel.hytale.server.core.modules.i18n.event`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched when translation messages are updated. Provides maps of changed and removed messages, organized as nested maps: the outer key is the language/file identifier, and the inner map contains individual message key-value pairs.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `changedMessages` | `Map<String,Map<String,String>>` | `getChangedMessages()` | No | No |
| `removedMessages` | `Map<String,Map<String,String>>` | `getRemovedMessages()` | No | No |

- **changedMessages** -- Nested map of messages that were added or modified. Outer key is the language/file, inner map is message key to value.
- **removedMessages** -- Nested map of messages that were removed. Same structure as changedMessages.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

```java
getEventRegistry().register(MessagesUpdated.class, event -> {
    Map<String, Map<String, String>> changed = event.getChangedMessages();
    Map<String, Map<String, String>> removed = event.getRemovedMessages();

    // React to translation changes
    for (var entry : changed.entrySet()) {
        getLogger().info("Language file updated: " + entry.getKey());
    }
});
```

## Related Events

- [`GenerateDefaultLanguageEvent`](./GenerateDefaultLanguageEvent.md) -- Fired during initial default language generation.
