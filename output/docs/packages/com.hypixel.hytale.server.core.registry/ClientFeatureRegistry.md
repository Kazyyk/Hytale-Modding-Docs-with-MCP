---
title: "ClientFeatureRegistry"
kind: "class"
package: "com.hypixel.hytale.server.core.registry"
fqcn: "com.hypixel.hytale.server.core.registry.ClientFeatureRegistry"
api_surface: true
extends: "Registry"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "server"
  - "core"
  - "registry"
---

**Package:** `com.hypixel.hytale.server.core.registry`

```java
public class ClientFeatureRegistry extends Registry<ClientFeatureRegistration>
```

Registry for managing and tracking registered resources.

## Methods

| Method | Returns | Description |
|---|---|---|
| `register(ClientFeature feature)` | `ClientFeatureRegistration` | Instance method. |
| `registerClientTag(String tag)` | `void` | Instance method. |
