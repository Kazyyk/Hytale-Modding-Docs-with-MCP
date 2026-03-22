---
title: "PluginEvent"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.plugin.event"
fqcn: "com.hypixel.hytale.server.core.plugin.event.PluginEvent"
api_surface: false
extends: ~
implements: ['IEvent']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "core"
  - "plugin"
  - "event"
---

**Package:** `com.hypixel.hytale.server.core.plugin.event`

```java
public abstract class PluginEvent implements IEvent<Class<? extends PluginBase>>
```

Server lifecycle event.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getPlugin()` | `PluginBase` | Accessor method. |
