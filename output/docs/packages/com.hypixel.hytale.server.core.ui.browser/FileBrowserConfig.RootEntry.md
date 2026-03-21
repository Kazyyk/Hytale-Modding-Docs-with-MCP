---
title: "FileBrowserConfig.RootEntry"
kind: "record"
package: "com.hypixel.hytale.server.core.ui.browser"
fqcn: "com.hypixel.hytale.server.core.ui.browser.FileBrowserConfig.RootEntry"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "ui"
  - "browser"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.ui.browser`

```java
public record RootEntry(@Nonnull LocalizableString displayName, @Nonnull Path path)
```

A root directory entry for the file browser, pairing a localizable display name with a filesystem path.

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `RootEntry(@Nonnull String displayName, @Nonnull Path path)` |
| `public` | `RootEntry(@Nonnull LocalizableString displayName, @Nonnull Path path)` |
