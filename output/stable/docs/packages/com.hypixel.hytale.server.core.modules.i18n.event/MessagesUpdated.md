---
title: "MessagesUpdated"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.i18n.event"
fqcn: "com.hypixel.hytale.server.core.modules.i18n.event.MessagesUpdated"
api_surface: false
extends: ~
implements: ['IEvent']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "modules"
  - "i18n"
  - "event"
---

**Package:** `com.hypixel.hytale.server.core.modules.i18n.event`

```java
public class MessagesUpdated implements IEvent<Void>
```

Server lifecycle event.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getChangedMessages()` | `Map<String, Map<String, String>>` | Accessor method. |
| `getRemovedMessages()` | `Map<String, Map<String, String>>` | Accessor method. |
