package model.node;

import model.train.TrackRepo;

import java.util.Map;

public interface NodeTracker {
    Map<String, Node> getNodes();
    Node getNode(String name);
    Node createNode(NodeFactory factory, String name, double length);

    TrackRepo getTrackRepo();

}
