# BsonTransformationUtil

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.util

public class BsonTransformationUtil

## Methods

- private static void actionOnProperty(BsonDocument entity, String[] propertyPath, BiConsumer<BsonValue,String> biConsumer, boolean create)
- public static void removeProperty(BsonDocument entity, String[] propertyPath)
- public static void setProperty(BsonDocument entity, String[] pathElements, BsonValue value)
- public static void insertProperty(BsonDocument entity, String[] pathElements, BsonValue value)

Also in this package: AssetPathUtil, AssetStoreUtil

Complete API:
  private static void actionOnProperty(BsonDocument entity, String[] propertyPath, BiConsumer<BsonValue,String> biConsumer, boolean create)
  public static void removeProperty(BsonDocument entity, String[] propertyPath)
  public static void setProperty(BsonDocument entity, String[] pathElements, BsonValue value)
  public static void insertProperty(BsonDocument entity, String[] pathElements, BsonValue value)
