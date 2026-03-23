---
title: "IEventBus"
kind: "interface"
package: "com.hypixel.hytale.event"
fqcn: "com.hypixel.hytale.event.IEventBus"
api_surface: true
extends: null
implements:
  - "IEventRegistry"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "event"
  - "interface"
  - "api"
---

**Package:** `com.hypixel.hytale.event`

```java
public interface IEventBus implements IEventRegistry
```

Combined event bus interface providing both registration (`IEventRegistry`) and dispatch (`dispatchFor`, `dispatchForAsync`) capabilities.
