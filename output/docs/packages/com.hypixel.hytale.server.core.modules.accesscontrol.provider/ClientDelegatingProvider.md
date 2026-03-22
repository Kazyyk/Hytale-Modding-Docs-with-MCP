---
title: "ClientDelegatingProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.accesscontrol.provider"
fqcn: "com.hypixel.hytale.server.core.modules.accesscontrol.provider.ClientDelegatingProvider"
api_surface: false
extends: null
implements: ["AccessProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "accesscontrol"
  - "provider"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.accesscontrol.provider`

```java
public class ClientDelegatingProvider implements AccessProvider
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `CompletableFuture<Optional<String>>` | `getDisconnectReason(UUID uuid)` |
