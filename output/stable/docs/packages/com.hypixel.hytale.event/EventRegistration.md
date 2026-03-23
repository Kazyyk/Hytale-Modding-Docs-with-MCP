---
title: "EventRegistration"
kind: "class"
package: "com.hypixel.hytale.event"
fqcn: "com.hypixel.hytale.event.EventRegistration"
api_surface: true
extends: "Registration"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "event"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.event`

```java
public class EventRegistration extends Registration
```

Handle returned when registering an event listener. Provides `unregister()` and `isEnabled()` lifecycle. Supports combining multiple registrations into a single handle via `combine()`.
