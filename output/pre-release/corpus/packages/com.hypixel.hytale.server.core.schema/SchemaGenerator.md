# SchemaGenerator

Type: class | Package: com.hypixel.hytale.server.core.schema

public class SchemaGenerator

Generates JSON schemas for asset types and plugin configurations. Collects schemas from all registered `AssetStore` instances and `ConfigRegistration` entries, writes them to a `Schema/` directory, and generates VS Code `settings.json` for schema-to-file associations.
