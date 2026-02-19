---
title: "GenerateSchemaEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.asset"
fqcn: "com.hypixel.hytale.server.core.asset.GenerateSchemaEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - asset
  - schema
---

> Package: `com.hypixel.hytale.server.core.asset`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched during schema generation for editor toolchain integration (e.g., VS Code JSON schema configuration). Listeners can add schemas and configure file associations through the provided methods.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `schemas` | `Map<String,Schema>` | -- | No | No |
| `context` | `SchemaContext` | `getContext()` | No | No |
| `vsCodeConfig` | `BsonDocument` | `getVsCodeConfig()` | No | No |

- **schemas** -- The map of schema filenames to `Schema` objects. Accessible via `addSchema(String, Schema)`.
- **context** -- The schema generation context.
- **vsCodeConfig** -- The VS Code configuration document for JSON schema associations.

## Methods

### `addSchema(String fileName, Schema schema)`

Adds a schema to the generation output.

### `addSchemaLink(String name, List<String> paths, String extension)`

Configures a VS Code JSON schema file match. Paths are prefixed with `/Server/` and the schema URL is set to `./Schema/<name>.json`. If the extension is non-null and not `.json`, a file association is added.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

```java
getEventRegistry().register(GenerateSchemaEvent.class, event -> {
    SchemaContext context = event.getContext();

    // Add a custom schema
    event.addSchema("my_config", myConfigSchema);

    // Link it to file patterns
    event.addSchemaLink("my_config", List.of("Config/MyPlugin/*.json"), ".json");
});
```

## Related Events

- [`LoadAssetEvent`](./LoadAssetEvent.md) -- Fired during the asset loading phase.
