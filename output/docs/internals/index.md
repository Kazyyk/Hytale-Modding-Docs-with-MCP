---
title: "Internal Types"
kind: "overview"
api_surface: "internal"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - "internals"
  - "disclaimer"
---

> **These are internal implementation types. They are not part of the stable plugin API and may change without notice between Hytale versions.**

The Hytale server JAR contains **6,062 internal types** that support the game's implementation. These types are used by the server's core systems but are not intended for direct use by plugin developers.

Internal types include:

- Network protocol handlers and packet definitions
- World generation algorithms and data structures
- Rendering pipeline support classes
- Server infrastructure and threading utilities
- Asset loading and caching internals

Plugin developers should use the [plugin-facing API](../api/index.md) instead. If you find yourself needing to access internal types, consider filing a feature request for the functionality to be exposed through the stable API.

Individual internal class documentation is not generated in this pass.
