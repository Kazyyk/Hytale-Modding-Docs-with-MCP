# BoxBlockIterator

Type: class | Package: com.hypixel.hytale.math.iterator | Extends: java.lang.Object

public class BoxBlockIterator

Iterates over all block positions within an axis-aligned bounding box defined by integer min/max coordinates. Visits blocks in Y-Z-X order (inner loop is X). Implements `Iterator<Vector3i>` for standard Java iteration and provides a bulk `forEach` method with a callback.
