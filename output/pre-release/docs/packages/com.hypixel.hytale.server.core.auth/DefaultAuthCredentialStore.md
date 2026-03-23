---
title: "DefaultAuthCredentialStore"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.DefaultAuthCredentialStore"
api_surface: false
extends: ~
implements: ["IAuthCredentialStore"]
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "auth"
  - "credentials"
---

**Package:** `com.hypixel.hytale.server.core.auth`

```java
public class DefaultAuthCredentialStore implements IAuthCredentialStore
```

In-memory credential store that does not persist tokens across restarts. Stores OAuth tokens and profile UUID in volatile fields.

## Methods

Implements all methods from [IAuthCredentialStore](IAuthCredentialStore.md). Stores tokens and profile UUID in volatile instance fields. `clear()` resets both to their default values.
