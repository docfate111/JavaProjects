package src;
public class Distance implements Place{
int dist;
public Distance(int d) {
	dist=d;
}
public int distance(Place other) {
	return dist;
}
public boolean sameDistance(Place p1, Place p2, Place p3) {
	return p1.distance(p2)==p1.distance(p3);
}
}
