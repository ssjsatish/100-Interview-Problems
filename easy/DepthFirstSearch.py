'''
// for the depthFirstSearch method.
// Feel free to add new properties
// and methods to the class.
// Do not edit the class below except
'''
class Node {
  constructor(name) {
    this.name = name;
    this.children = [];
  }

  addChild(name) {
    this.children.push(new Node(name));
    return this;
  }

  depthFirstSearch(array) {
    // Write your code here.
  }
}

// Do not edit the line below.
exports.Node = Node;
