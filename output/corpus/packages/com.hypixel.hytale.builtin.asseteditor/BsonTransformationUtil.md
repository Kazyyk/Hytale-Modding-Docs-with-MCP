# BsonTransformationUtil

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.util

public class BsonTransformationUtil

Static utility for manipulating BSON document properties by path. Used by the JSON asset update system to apply incremental edits (set, remove, insert) to asset documents without full serialization/deserialization.

Property paths are represented as `String[]` arrays where each element is either a document key or an array index (numeric string).

## Methods

- void setProperty(BsonDocument, String[], BsonValue) | Sets (or overwrites) a property at the given path, creating intermediate objects/arrays as needed
- void removeProperty(BsonDocument, String[]) | Removes a property at the given path; no-ops if the path does not exist
- void insertProperty(BsonDocument, String[], BsonValue) | Inserts a value at the given path; for arrays, inserts at the specified index (shifting later elements)

All three methods traverse the path depth-first, handling both `BsonDocument` (by key) and `BsonArray` (by numeric index) at each level. Throws `IllegalArgumentException` if a non-terminal path element is neither a document nor an array with a valid index.
