---
title: "DisableProcessingAssert"
kind: "interface"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.DisableProcessingAssert"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
@Deprecated(forRemoval = true)
public interface DisableProcessingAssert
```

A deprecated marker interface. When a `RefSystem` implements this interface, the [Store](Store.md) temporarily disables its write-processing assertion during entity add/remove callbacks for that system. This is a legacy escape hatch that allows certain systems to perform direct store mutations during callbacks. Scheduled for removal.

## Related Types

- [Store](Store.md) -- checks for this interface during entity lifecycle callbacks
